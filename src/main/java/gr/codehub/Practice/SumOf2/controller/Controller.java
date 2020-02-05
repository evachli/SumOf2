package gr.codehub.Practice.SumOf2.controller;

import gr.codehub.Practice.SumOf2.dto.OperatorDto;
import gr.codehub.Practice.SumOf2.model.Numbers;
import gr.codehub.Practice.SumOf2.service.Operations;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.IOException;

@RestController
@Data
public class Controller {

    @GetMapping("{x}/{y}")
    public OperatorDto getsumOfnumbers(@PathVariable int x , @PathVariable int y ) throws FileNotFoundException {
        Numbers numbers = new Numbers(x,y);
        Operations operations = new Operations(numbers);
        OperatorDto operatorDto = new OperatorDto();

        operatorDto.setSum(operations.getsumOfnumbers());
        operatorDto.setProduct(operations.getProductOfnumbers());
        operatorDto.setMax(operations.getMaxOfnumbers());
        operatorDto.setMin(operations.getMinOfnumbers());
            return operatorDto;
        }

}
