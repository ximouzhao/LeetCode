package programbase.serializable;

import java.io.Serializable;

class Circle extends Shape implements Serializable {
    Circle(){
        super(1);
    }

private float radius=111;

transient int color;

public static String type = "Circle";

}
