import java.util.Scanner;

public class Mobile {
    public static Scanner ob=new Scanner(System.in);
    public info info;
    public String name;
    public Mobile(){
        System.out.print("Введите название телефона:");
        setName(ob.next());
        info = new info();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public class info{
        int memory, capacity,camera;
        public info(){
            System.out.print("Объём памяти:");
            setMemory(ob.nextInt());
            System.out.print("Ёмкость аккумуляторов:");
            setCapacity(ob.nextInt());
            System.out.print("Количество мегапикселей камеры:");
            setCamera(ob.nextInt());
        }
        public int getMemory(){
            return memory;
        }
        public void setMemory(int memory){
            this.memory=memory;
        }
        public int getCapacity(){
            return capacity;
        }
        public void setCapacity(int capacity){
            this.capacity=capacity;
        }
        public int getCamera(){
            return camera;
        }
        public void setCamera(int camera){
            this.camera=camera;
        }
        public void print(){
            System.out.print("Название телефона:" + getName()+"\n");
            System.out.print("Объём памяти:" + getMemory() + "Гб"+"\n");
            System.out.print("Ёмкость аккумуляторов:" + getCapacity()+"мА/ч"+"\n");
            System.out.print("Камера:" + getCamera()+"Мп"+"\n");
        }
    }
    static public void main(String[]args){
        Mobile mb=new Mobile();
        mb.info.print();
    }
}
