package it.xie.Day_7.annotation.SOURCE_Read;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *  @author : xiaoxie
 *   @Des:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface IntDef {
    int[] value();
}
