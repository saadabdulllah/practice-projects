package examples;

import lombok.Value;

/**
 * Created by shantonu on 5/24/16.
 */
@Value(staticConstructor = "getInstance")
public class Entity {
    private String name;
    private String id;
    private String address;

}
