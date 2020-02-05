package gr.codehub.Practice.SumOf2.service;

import gr.codehub.Practice.SumOf2.model.Numbers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operations {
    private Numbers numbers;

    public int getsumOfnumbers(){
        int sum = numbers.getX() + numbers.getY();
        return sum;
    }

    public int getProductOfnumbers(){
        int product = numbers.getX() * numbers.getY();
        return product;
    }

    public int getMaxOfnumbers(){
        if (numbers.getX() - numbers.getY() < 0)
            return numbers.getY();
        else if (numbers.getX() - numbers.getY() > 0)
            return numbers.getX();
        return numbers.getY();
    }
    public int getMinOfnumbers(){
        if (numbers.getX() - numbers.getY() < 0)
            return numbers.getX();
        else if (numbers.getX() - numbers.getY() > 0)
            return numbers.getY();
        return numbers.getY();
    }




}
