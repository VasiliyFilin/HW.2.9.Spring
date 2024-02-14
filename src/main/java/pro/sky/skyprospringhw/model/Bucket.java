package pro.sky.skyprospringhw.model;

import java.util.Objects;

public class Bucket {
    private final String itemId;

    public Bucket(String itemId) {
        this.itemId = itemId;
    }

    public String  getItemId() {
        return itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bucket bucket)) return false;
        return Objects.equals(itemId, bucket.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "itemId=" + itemId +
                '}';
    }
}
