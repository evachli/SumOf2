package gr.codehub.Practice.SumOf2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperatorDto {
    private int sum;
    private int product;
    private int max;
    private int min;
}
