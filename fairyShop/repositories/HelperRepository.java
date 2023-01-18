package fairyShop.repositories;

import fairyShop.models.Helper;

import java.util.*;

public class HelperRepository<T> implements Repository<Helper> {
    private List<Helper> helpers = new ArrayList<>();

    public Collection<Helper> getModels() {
        return Collections.unmodifiableList(this.helpers);
    }

    public void add(Helper model) {
        this.helpers.add(model);
    }

    public boolean remove(Helper model) {
        return this.helpers.remove(model);
    }

    public Helper findByName(final String name) {
        return this.helpers.stream().filter(helper -> helper.getName().equals(name)).findFirst().orElse(null);
    }
}
