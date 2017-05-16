package 过滤器;

import java.io.File;
import java.io.FilenameFilter;
/*
 * 根据后缀名可以指定任意后缀名过滤的过滤器
 */
public class SuffixFilter implements FilenameFilter {
private String suffix ;
public SuffixFilter(String suffix) {
super();
this.suffix = suffix;
}
@Override
public boolean accept(File dir, String name) {
return name.endsWith(suffix);
}
}
