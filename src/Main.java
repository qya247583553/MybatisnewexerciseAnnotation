import MybatisUtil.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        try (SqlSession session = MybatisUtil.getSession(true)) {

        }
    }
}

