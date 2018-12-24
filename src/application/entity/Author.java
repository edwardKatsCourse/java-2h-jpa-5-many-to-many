package application.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter @Setter

@Entity
@Table(name="author_mtm")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length=100, unique = true)
	@NotBlank //null, .trim(), length != 0
//	@Email
	private String name; //"some text"

//	@Min(0)
//	@Max(150)
//	@NotNull
	private Integer age;
	//15
	//150
	//151
	//null
	
	@ManyToMany(mappedBy = "authors", cascade = CascadeType.MERGE)
	@JsonBackReference
	private List<Book> books = new ArrayList<>();

	public Author(@NotNull String name) {
		this.name = name;
	}
	
	
	
	

}
