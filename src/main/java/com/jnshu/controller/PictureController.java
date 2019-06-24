package com.jnshu.controller;

import com.jnshu.pojo.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class PictureController {
    private static Logger log = LogManager.getLogger(PictureController.class);

    @RequestMapping(value = "/pictureUp", method = RequestMethod.POST)
    public Result pictureUp(MultipartFile file) throws IOException {
        String realpath = "F:\\PictureTest\\";//地址
        log.info("判断上传文件是否为空");
        if (file != null && file.getSize() != 0) {
            String fileName = file.getOriginalFilename();
            String trunFileName = System.currentTimeMillis() + fileName;
            String path = realpath + trunFileName;
            log.info("转存文件到指定路径");
            file.transferTo(new File(path));
            String url = "/PictureTest/" + trunFileName;
            log.info("图片放到数据库中的相对路径：" + url);

            return new Result(1, "success", path);
        } else {
            log.info("图片上传失败");
            return new Result(-1, "上传失败");
        }
    }

    @RequestMapping(value = "/photoUpload", method = RequestMethod.POST)
    public Result photoUpload(MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException {
        Result result = new Result();
        if (file != null) {// 判断上传的文件是否为空
            String path;// 文件路径
            String type;// 文件类型
            String fileName = file.getOriginalFilename();// 文件原名称
            System.out.println("上传的文件原名称:" + fileName);
            // 判断文件类型
            type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1) : null;
            if (type != null) {// 判断文件类型是否为空
                if ("GIF".equals(type.toUpperCase()) || "PNG".equals(type.toUpperCase()) || "JPG".equals(type.toUpperCase())) {
                    // 项目在容器中实际发布运行的根路径
                    String realPath = request.getSession().getServletContext().getRealPath("/");
                    // 自定义的文件名称
                    String trueFileName = System.currentTimeMillis() + fileName;
                    // 设置存放图片文件的路径
                    path = realPath +/*System.getProperty("file.separator")+*/trueFileName;
                    System.out.println("存放图片文件的路径:" + path);
                    // 转存文件到指定的路径
                    file.transferTo(new File(path));
                    result.setMessage("文件成功上传到指定目录下" + path);
                } else {
                    result.setMessage("不是我们想要的文件类型,请按要求重新上传");
                    return result;
                }
            } else {
                result.setMessage("文件类型为空");
                return result;
            }
        } else {
            result.setMessage("没有找到相对应的文件");
            return result;
        }
        return result;
    }
}
