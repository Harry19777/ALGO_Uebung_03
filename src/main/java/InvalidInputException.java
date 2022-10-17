/*
 * @Author: Harald Ederer
 * @Date: 16.10.2022
 */
public class InvalidInputException extends Exception{
    @Override
    public String getMessage() {
        return "Invalid Input! Choose available Character!!!";
    }
}
