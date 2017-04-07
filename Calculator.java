// 06.04.2017

/*Класс реализует калькулятор*/

public class Calculator{

    /*Результат вычисления*/
    private double result;
    public void add(double ... params){
        for(Double param : params){
            this.result += param;
        }
    }

    /*Выдача результата*/
    public double getResult(){
        return this.result;
    }

    /*Очистить резльтат вычисления*/
    public void cleanResult(){
        this.result = 0;
    }
}