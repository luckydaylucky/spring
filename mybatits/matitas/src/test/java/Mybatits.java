import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * @Author: MR.z
 * @Date: 2018/12/7 16:25
 * @Version 1.0
 */
public class Mybatits {
    private SqlSessionFactory sqlSessionFactory = null;
    @Before
    public void init() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }
    @Test
    public void querryOne() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("张三");
        user.setSex("男");
        user.setBirthday(new Date());
        user.setAddress("北京");
    }
}
