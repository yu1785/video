package cn.itcast.demo1;
/*
    输出线程 输出资源对象Resource中成员变量
 */
public class Output implements Runnable{
    private Resource r;

    public Output(Resource r){
        this.r = r;
    }

    public void run(){
        while (true){
            synchronized (r){
                System.out.println(r.name+"..."+r.sex);
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
