package 过滤器;

import java.io.File;
import java.io.FilenameFilter;
/*
 * 1-后缀名过滤器
 */
public class FilterByJava implements FilenameFilter {
@Override
public boolean accept(File dir, String name) {
// System.out.println(dir+"---"+name);
return name.endsWith(".java");
}
}