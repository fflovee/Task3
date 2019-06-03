import com.jnshu.dao.LeaveWordsMapper;
import com.jnshu.pojo.LeaveWords;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springMybatis.xml")
public class Demo {

    private Logger log = LogManager.getLogger(Demo.class);

    @Autowired
    LeaveWordsMapper leaveWordsMapper;

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
}