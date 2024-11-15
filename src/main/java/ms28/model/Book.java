package ms28.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Book {
    private Long id;
    private String title;
    private String author;
}
