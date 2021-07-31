package Main.Vehicles;

import java.io.Serializable;

public enum WelfareServices  implements Serializable {
    RESTAURANT, WATCH_MOVIE, LISTENING_MUSIC, TOILET_BATH, READING_BOOK_NEWSPAPER;
    public static WelfareServices[] service = WelfareServices.values();
}
