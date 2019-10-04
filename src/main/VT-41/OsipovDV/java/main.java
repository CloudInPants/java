
import java.util.*;


public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<String,Creator> map = new HashMap<String, Creator>();
        map.put("Камера",new CameraCreator());
        map.put("Сыр", new CheeseCreator());
        map.put("Молочный", new MilkCreator());
        map.put("Кубик-Рубика", new RubikCreator());
        map.put("Техника", new TechincsCreator());
        map.put("Игрушка", new ToyCreator());
        map.put("Телевизор", new TVCreator());
        int N=0;
        ArrayList<Product> productList=new ArrayList<Product>() ;
        String tmp;
        rest:
        {
            System.out.println("Введите число товаров:");
            if(sc.hasNextInt())
            {
                 N= sc.nextInt();
            }
            else {
                System.out.println("Введите корректное число");
                break rest;
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.println("Введите вид или наименование товара");
            //while(!sc.);
            tmp=sc.next();
            if(map.containsKey(tmp)) {
                productList.add(0,map.get(tmp).factoryMethod());
            }
            else
            {
                System.out.println("Нет такого товара");
            }
            productList.get(0).init(sc);
        }
        sc.close();
        int indexMin=0;
        int min=productList.get(0).getCost();
        for(int i=1;i<productList.size();i++)
        {
            if(productList.get(i).getCost()<min)
            {
                indexMin = i;
                min=productList.get(0).getCost();
            }
        }
        System.out.println("Самый дешёвый товар\n"+productList.get(indexMin).toString());
    }
}
