import com.jnshu.dao.BannerManageMapper;
import com.jnshu.dao.LeaveWordsMapper;
import com.jnshu.dao.ProductionManageMapper;
import com.jnshu.pojo.BannerManage;
import com.jnshu.pojo.LeaveWords;
import com.jnshu.pojo.ProductionManage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springMybatis.xml")
//添加注释才能在测试类中使用
public class Demo {

    private Logger log = LogManager.getLogger(Demo.class);

    @Autowired
    LeaveWordsMapper leaveWordsMapper;
    @Autowired
    BannerManageMapper bannerManageMapper;
    @Autowired
    ProductionManageMapper productionManageMapper;

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

    @Test
    public void insertProduction() {
        for (int i = 0;i<10;i++){
            ProductionManage productionManage = new ProductionManage();
            productionManage.setProductionName("架上绘画.装置");
            productionManage.setProductionIntro("大风鸟谁佛的时间啊开了房建档立卡");
            productionManage.setSeconddirectory("今飞凯达拉时间浪费");
            productionManage.setThumbnaUrl("djfklasjdklf;as");
            productionManage.setVideoUrl("djfioweirqew");
            productionManage.setInfopictureUrl("表姐哦亲加分的破碎、");
            productionManage.setProductionInfo("jiofjdasl;kj");
            productionManage.setProductionState((byte)1);
            productionManage.setCreateAt(System.currentTimeMillis());
            productionManage.setUpdateAt(System.currentTimeMillis());
            productionManage.setCreateBy("张大雄");
            productionManageMapper.insert(productionManage);



        }
    }
}