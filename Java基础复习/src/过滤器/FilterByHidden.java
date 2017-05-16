package 过滤器;

import java.io.File;
import java.io.FileFilter;
/*
 * 
 * 隐藏属性过滤器
 */
public class FilterByHidden implements FileFilter {
@Override
public boolean accept(File pathname) {
return !pathname.isHidden();
}
}
