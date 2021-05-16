//package com.alipay.kris.other.lombok;
//
//
//import javax.annotation.processing.AbstractProcessor;
//import javax.annotation.processing.RoundEnvironment;
//import javax.annotation.processing.SupportedAnnotationTypes;
//import javax.annotation.processing.SupportedSourceVersion;
//import javax.lang.model.SourceVersion;
//import java.util.Set;
//
//@SupportedSourceVersion(SourceVersion.RELEASE_8)
//@SupportedAnnotationTypes("com.alipay.kris.other.lombok.*")
//public class MyAnnotaionProcessor extends AbstractProcessor {
//    public MyAnnotaionProcessor(){super();    }
//    @Override
//    public boolean process(Set annotations, RoundEnvironment roundEnv){
//        for(Element elem : roundEnv.getElementsAnnotatedWith(MyAnnotation.class)) {
//            MyAnnotation annotation = elem.getAnnotation(MyAnnotation.class);
//            String message ="annotation found in "+ elem.getSimpleName()                +" with  "+ annotation.value();            addToString(elem);            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, message);        }
//    }return true;// no further processing of this annotation type}
//}
