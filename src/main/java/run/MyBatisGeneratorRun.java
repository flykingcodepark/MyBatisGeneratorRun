package run;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lxb
 * @Description:
 * @Date: Create in  2018/9/8
 */
public class MyBatisGeneratorRun {
    public static void main(String[] args) throws Exception{
        MyBatisGeneratorRun app = new MyBatisGeneratorRun();

        System.out.println(app.getClass().getResource("/").getPath());
        app.generator();
        System.out.println("生成文件根目录:"+System.getProperty("user.dir"));
        System.out.println("生成完成.......");
    }

    public void generator() throws Exception{

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(resourceAsStream);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);

        for(String warning:warnings){
            System.out.println(warning);
        }
    }
}
