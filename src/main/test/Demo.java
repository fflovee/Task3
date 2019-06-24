import com.jnshu.dao.BannerManageMapper;
import com.jnshu.dao.LeaveWordsMapper;
import com.jnshu.pojo.BannerManage;
import com.jnshu.pojo.LeaveWords;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springMybatis.xml")
//添加注释才能在测试类中使用
public class Demo {

    private Logger log = LogManager.getLogger(Demo.class);

    @Autowired
    LeaveWordsMapper leaveWordsMapper;
    @Autowired
    BannerManageMapper bannerManageMapper;

    @Test
    public void insert() {
        LeaveWords leaveWords = new LeaveWords();
        leaveWords.setLeavewordsId(1L);
        leaveWords.setProductionName("《白墙黑瓦飘流水》");
        leaveWords.setLeavewords("不错不错很好很好");
        leaveWords.setLeavewordsStat((byte) 1);
        leaveWords.setTouristsNickname("小影子");
        Long time = System.currentTimeMillis();
        leaveWords.setCreateAt(time);
        leaveWords.setUpdateAt(time);
        leaveWords.setCreateBy(leaveWords.getTouristsNickname());
        leaveWords.setLeavewordsReply("xiexiexiexie");
        System.out.println(leaveWords);
        leaveWordsMapper.insert(leaveWords);
        log.info("===============================数据插入成功===============================");
    }

    @Test
    public void insertBanner() {
        for (int i=0;i<10;i++){
            BannerManage bannerManage = new BannerManage();
            bannerManage.setProductionUrl("www.jnshu.com");
            bannerManage.setIllustratingPicture("www.baidu.com");
            bannerManage.setBannerState((byte) 1);
            bannerManage.setCreateAt(System.currentTimeMillis());
            bannerManage.setUpdateAt(System.currentTimeMillis());
            bannerManage.setCreateBy("小李子");
            bannerManageMapper.insertSelective(bannerManage);
        }
    }

    @Test
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
//        System.out.println("a + b = " + (a + b) );
//        System.out.println("a - b = " + (a - b) );
//        System.out.println("a * b = " + (a * b) );
//        System.out.println("b / a = " + (b / a) );
//        System.out.println("b % a = " + (b % a) );
//        System.out.println("c % a = " + (c % a) );
//        System.out.println("a++   = " +  (a++) );
//        System.out.println("a--   = " +  (a--) );
//        // 查看  d++ 与 ++d 的不同
//        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
    }

    @Test
    public void niaho() {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.subList(0,4));

    }


/*    @Test
    public void updateBannerlist(Long[] ids) {
        int index = 1;
        for (Long id : ids) {
            BannerManage bannerManage = new BannerManage();
            bannerManage.setWeight(index);
            bannerManage.setId(id);
            bannerManageMapper.updateByPrimaryKeySelective(bannerManage);
            index++;
        }
    }*/

}