package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


public class Audience {
//    @Pointcut("execution(* concert.Performance.perform(..))")
//    public void performance(){}
//    @Before("performance()")
//    public void silenceCellPhones(){
//        System.out.println("Silenceing cell phones");
//    }
//    @Before("performance()")
//    public void takeSeats(){
//        System.out.println("Taking seats");
//    }
//    @AfterReturning("performance()")
//    public void applause(){
//        System.out.println("CLAP CLAP CLAP!!!");
//    }
//    @AfterThrowing("performance()")
//    public void demandRefund(){
//        System.out.println("Demanding a refund");
//    }
//    @Around("performance()")
//    public void watchPerformance(ProceedingJoinPoint jp){
//        int i=0;
//      while (true){
//          try{
//              System.out.println("Silenceing cell phones");
//              System.out.println("Taking seats");
//              if(i==3){
//                  break;
//              }
//              i++;
//              jp.proceed();
//              System.out.println("CLAP CLAP CLAP!!!");
//              break;
//          }catch (Throwable e){
//              System.out.println("Demanding a refund");
//          }
//      }
//    }

    public void silenceCellPhones(){
        System.out.println("Silenceing cell phones");
    }

    public void takeSeats(){
        System.out.println("Taking seats");
    }

    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
    public void watchPerformance(ProceedingJoinPoint jp) {


            try {
                System.out.println("Silenceing cell phones");
                System.out.println("Taking seats");
                jp.proceed();
                System.out.println("CLAP CLAP CLAP!!!");

            } catch (Throwable e) {
                System.out.println("Demanding a refund");
            }

    }
}
