package nvc.it.ice_factory_tanakorn.model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Event {
    private Integer amount;
    private Date createdAt;
}
