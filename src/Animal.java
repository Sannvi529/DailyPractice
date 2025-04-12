import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 张英琪
 * 通过junit进行独立运行
 */
public class Animal {
    @Before
    public void before(){
        System.out.println("测试开始");
    }
    @After
    public void after(){
        System.out.println("测试结束");
    }
    /**
     * 实现加法
     * @param num1 传入的参数1
     * @param num2 传入的参数2
     * @return 返回加法的结果
     */
    public int add(int num1,int num2){
        return num1+num2;
    }
    @Test
    public void addTest(){
        int ans = add(1,2);
        System.out.println(ans);
        Assert.assertEquals(3,ans);
    }

    /**
     * 文档注解，配合javadoc一起使用，生成API
     * 父类方法：吃好
     */
    @Test
    public void eat(){
        System.out.println("吃好吃的");
    }
    @Test
    public void play(){
        System.out.println("玩好玩的");
    }

    /**
     * 自定义方法使其过时
     * 表明方法已过时
     */
    @Deprecated
    public void tired(){
        System.out.println("我很疲惫");
    }
}
