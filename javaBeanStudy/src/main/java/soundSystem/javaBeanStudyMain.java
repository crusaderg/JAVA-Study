package soundSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = {"soundSystem"} )
public class javaBeanStudyMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(javaBeanStudyMain.class);
        try {
            BigPepper bean = ctx.getBean(BigPepper.class);
            bean.dumpPeppers();
        } finally {
            ctx.close();
        }
    }
}
