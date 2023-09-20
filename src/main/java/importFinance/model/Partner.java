package importFinance.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Partners")
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double contribution;
    private double earnings;
    private double profit;

    public Partner(String name, double contribution, double earnings) {
        this.name = name;
        this.contribution = contribution;
        this.earnings = earnings;
        this.profit = earnings - contribution;
    }
}