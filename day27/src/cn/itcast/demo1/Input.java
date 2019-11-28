package cn.itcast.demo1;

public class Input implements Runnable{
    private Resource r;

    public Input(Resource r){
        this.r = r;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        int i = 0;
        while (true){
            synchronized (r){
                if (i%2 == 0){
                    r.name = "张三";
                    r.sex = "男";
                }else {
                    r.name = "lili";
                    r.sex = "nv";
                }
            }
            i ++;
        }
    }
}
