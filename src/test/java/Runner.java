import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by EgorZhuravlev on 7/6/2016.
 */


@RunWith(Categories.class)
@Categories.IncludeCategory({SlowTests.class,FastTests.class})
@Categories.ExcludeCategory(FastTests.class)
@Suite.SuiteClasses( { Class0.class, Class2.class })
public class Runner {
}
