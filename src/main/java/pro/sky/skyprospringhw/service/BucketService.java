package pro.sky.skyprospringhw.service;

import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skyprospringhw.model.Bucket;
import static org.apache.commons.lang3.StringUtils.*;

import java.util.*;

@Service
@SessionScope
public class BucketService {
    private final List<Bucket> bucketList = new ArrayList<>();

    public void addItem(String[] itemIds) throws BadRequestException {
        for (String itemId : itemIds) {
            if (isNumeric(itemId)) {
                Bucket bucket = new Bucket(itemId);
                bucketList.add(bucket);
            } else {
                throw new BadRequestException();
            }
        }
    }

    public Collection<Bucket> getAllItems() {
        return Collections.unmodifiableCollection(bucketList);
    }
}
