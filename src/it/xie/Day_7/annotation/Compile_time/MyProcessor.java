package it.xie.Day_7.annotation.Compile_time;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * https://blog.csdn.net/github_35180164/article/details/52055994
 *  @author : xiaoxie
 *   @Des: 注解处理器 可以进行处理编译时期的注解
 *          我们需要把我们写好的类 注册到javac编译器里面进行 这样在javac编译器启动的时候就可以了！
 *           其实认真想想这还是使用了代理的思想
 */

@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes({
        // 合法注解全名的集合
        //java7 以上可以使用这个注解来代替
})
public class MyProcessor extends AbstractProcessor {

    //通过将processingEnv字段设置为processingEnv参数的值，通过处理processingEnv
    //processingEnv - 工具框架向处理器提供访问环境的环境
    @Override
    public synchronized void init(ProcessingEnvironment env){ }

    @Override
    public boolean process(Set<? extends TypeElement> annoations, RoundEnvironment env) {
        return false;
    }
     //这个注解处理器是注册给哪个注解的。注意，它的返回值是一个字符串的集合，包含本处理器想要处理的注解类型的合法全称。
     // 换句话说，你在这里定义你的注解处理器注册到哪些注解上。
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return null;
    }

    //用来指定你使用的Java版本。通常这里返回SourceVersion.latestSupported()
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }
} 