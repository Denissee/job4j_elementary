package ru.job4j.condition;

public class SwitchWeek {
    public String nameOfday(int day) {
        String result;
        switch (day) {
            case 1 :
                result = "Понедельник";
                break;
            case 2 :
                result = "Вторник";
                break;
            case 3 :
                result = "Понедельник";
                break;
            case 4 :
                result = "Вторник";
                break;
            case 5 :
                result = "Понедельник";
                break;
            case 6 :
                result = "Вторник";
                break;
            case 7 :
                result = "Понедельник";
                break;
            default:
                result = "Ошибка";
                break;
        }
        return result;
    }
}