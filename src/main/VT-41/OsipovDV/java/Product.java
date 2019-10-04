import java.util.Scanner;

public abstract  class Product {
    public abstract void init(Scanner scanner); // считывание параметров с консоли

    public abstract int getCost();// возвращает стоимость товара

    public abstract boolean canBuy(int xcost); // определяет, можно ли купить товар за имеющуюся // сумму
}

abstract class Creator {
    public abstract Product factoryMethod();
}

class Toy extends Product{// класс Игрушка
    private int cost;
    private String name;
    //private int permAge;
    public void init(Scanner scanner)
    {
        System.out.println("Введите цену игрушки");
        recost:
        {
            if(scanner.hasNextInt())
            {
                cost=scanner.nextInt();
            }
            else {
                System.out.println("Введите число!");
                break recost;
            }
        }
        System.out.println("Введите наименование");
        name=scanner.next();
    }
    public  int getCost()
    {
        return cost;
    }
    public boolean canBuy(int xcost)
    {
        return cost <= xcost;
    }
    public String toString()
    {
        return "Товар: Игрушка\n" + "Наименование: " + name + "\n" + "Цена: " + cost + "\n";
    }
}
class ToyCreator extends Creator {// класс Фабричный метод создания игрушки
    @Override
    public Product factoryMethod() { return new Toy(); }
}

class Rubik extends Toy{// Класс Кубик-Рубик
    private int cost;
    private int dim;
    public void init(Scanner scanner)
    {
        System.out.println("Введите цену Кубика-Рубика");
        re:
        {
            if(scanner.hasNextInt())
            {
                cost=scanner.nextInt();
            }
            else {
                System.out.println("Введите число!");
                break re;
            }
        }
        System.out.println("Введите размерность");
        re:
        {
            if(scanner.hasNextInt())
            {
                dim=scanner.nextInt();
            }
            else {
                System.out.println("Введите число!");
                break re;
            }
        }
    }
    public  int getCost()
    {
        return cost;
    }
    public boolean canBuy(int xcost)
    {
        return cost <= xcost;
    }
    public String toString()
    {
        return "Товар: Игрушка\n" + "Наименование: Кубик-Рубика\n" + "Размерность: " + dim + "\n" + "Цена: " + cost + "\n";
    }
}

class RubikCreator extends Creator {
    @Override
    public Product factoryMethod() { return new Rubik(); }
}

class Milk extends Product{
    private int cost;
    private String name;
    public void init(Scanner scanner)
    {
        System.out.println("Введите цену молочного продукта");
        recost:
        {
            if(scanner.hasNextInt())
            {
                cost=scanner.nextInt();
            }
            else {
                System.out.println("Введите число!");
                break recost;
            }
        }
        System.out.println("Введите наименование");
        name=scanner.next();
    }
    public  int getCost()
    {
        return cost;
    }
    public boolean canBuy(int xcost)
    {
        return cost <= xcost;
    }
    public String toString()
    {
        return "Товар: Молочный\n" + "Наименование: " + name + "\n" + "Цена: " + cost + "\n";
    }
}

class MilkCreator extends Creator {
    @Override
    public Product factoryMethod() { return new Milk(); }
}

class Cheese extends Milk{
    private int cost;
    private int mass;
    public void init(Scanner scanner)
    {
        System.out.println("Введите цену сыра");
        re:
        {
            if(scanner.hasNextInt())
            {
                cost=scanner.nextInt();
            }
            else {
                System.out.println("Введите число!");
                break re;
            }
        }
        System.out.println("Введите вес");
        re:
        {
            if(scanner.hasNextInt())
            {
                mass=scanner.nextInt();
            }
            else {
                System.out.println("Введите число!");
                break re;
            }
        }
    }
    public  int getCost()
    {
        return cost;
    }
    public boolean canBuy(int xcost)
    {
        return cost <= xcost;
    }
    public String toString()
    {
        return "Товар: Сыр\n" + "Вес: " + mass + "\n" + "Цена: " + cost + "\n";
    }
}

class CheeseCreator extends Creator {
    @Override
    public Product factoryMethod() { return new Cheese(); }
}

class Techincs extends Product{
    private int cost;
    private String name;
    public void init(Scanner scanner)
    {
        System.out.println("Введите цену техники");
        recost:
        {
            if(scanner.hasNextInt())
            {
                cost=scanner.nextInt();
            }
            else {
                System.out.println("Введите число!");
                break recost;
            }
        }
        System.out.println("Введите наименование");
        name=scanner.nextLine();
    }
    public  int getCost()
    {
        return cost;
    }
    public boolean canBuy(int xcost)
    {
        return cost <= xcost;
    }
    public String toString()
    {
        return "Товар: Техника\n" + "Наименование: " + name + "\n" + "Цена: " + cost + "\n";
    }
}

class TechincsCreator extends Creator {
    @Override
    public Product factoryMethod() { return new Techincs(); }
}

class Camera extends Techincs{
    private int cost;
    private int res;
    public void init(Scanner scanner)
    {
        System.out.println("Введите цену камеры");
        recost:
        {
            if(scanner.hasNextInt())
            {
                cost=scanner.nextInt();
            }
            else {
                System.out.println("Введите число!");
                break recost;
            }
        }
        System.out.println("Введите разрешение камеры");
        reres:
        {
            if(scanner.hasNextInt())
            {
                res=scanner.nextInt();
            }
            else {
                System.out.println("Введите число!");
                break reres;
            }
        }
    }
    public  int getCost()
    {
        return cost;
    }
    public boolean canBuy(int xcost)
    {
        return cost <= xcost;
    }
    public String toString()
    {
        return "Товар: Камера\n" + "Разрешение камеры: " + res + "\n" + "Цена: " + cost + "\n";
    }
}

class CameraCreator extends Creator {
    @Override
    public Product factoryMethod() { return new Camera(); }
}

class TV extends Techincs{
    private int cost;
    private int diag;
    public void init(Scanner scanner)
    {
        System.out.println("Введите цену телевизора");
        recost:
        {
            if(scanner.hasNextInt())
            {
                cost=scanner.nextInt();
            }
            else {
                System.out.println("Введите число!");
                break recost;
            }
        }
        System.out.println("Введите диагональ");
        rediag:
        {
            if(scanner.hasNextInt())
            {
                diag=scanner.nextInt();
            }
            else {
                System.out.println("Введите число!");
                break rediag;
            }
        }
    }
    public  int getCost()
    {
        return cost;
    }
    public boolean canBuy(int xcost)
    {
        return cost <= xcost;
    }
    public String toString()
    {
        return "Товар: Телевизор\n"+"Диагональ: "+ diag +"\n"+"Цена: "+ cost +"\n";
    }
}

class TVCreator extends Creator {
    @Override
    public Product factoryMethod() { return new TV(); }
}