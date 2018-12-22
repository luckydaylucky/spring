import com.itheima.test.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/6 20:21
 * @Version 1.0
 */
public class MybatisTest {
    private SqlSessionFactory sqlSessionFactory = null;
    @Test
    public void testQuerryByid() throws IOException {
        //创建sqlsessionfactorybuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        加载sqlmapconfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//        创建sqlsessionfactory对象
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//        创建sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        执行sqlsessiong对象执行查询，获取结果user
        Object querryUserByid = sqlSession.selectOne("querryUserByid", 1);
//        打印结果
        System.out.println(querryUserByid);
//        释放资源
        sqlSession.close();
    }

    @Test
    public void testQuerryByname() throws IOException {

//        创建sqlsessionfactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        加载sqlmapconfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//        加载sqlsessionfactory对象
         this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//        创建sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        执行sqlsession对象执行查询，获取结果user
        List<User> list = sqlSession.selectList("querryUserByname","%王%");
//        打印结果
        for(User user : list){
            System.out.println(user);
        }
//        释放资源
        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Object> list = sqlSession.selectList("querryByname1","王");
        for(Object user : list){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void saveUser() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        User user = new User(User.class);
        user.setUsername("张飞");
        user.setSex("男");
        user.setAddress("北京");
        sqlSession.insert("saveUser",user);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();

    }
}
