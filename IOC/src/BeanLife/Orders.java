package BeanLife;

public class Orders {
    private String name;

    public Orders(){
        System.out.println("1.无参构造器------------");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2.set方法-----------------");
    }

    public void initMethod(){
        System.out.println("3.初始化方法--------------------");
    }

    public void destroyMethod(){
        System.out.println("5.销毁方法--------------");
    }
}
