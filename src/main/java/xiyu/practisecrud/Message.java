package xiyu.practisecrud;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name="chatMessage")
@Data
//@NoArgsConstructor
public class Message {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="messageid")
    private Long id;
    //@NonNull
    @Column(name="contents")
    private String contents;
    @Column(name ="text")
    private String textName="test";


}
