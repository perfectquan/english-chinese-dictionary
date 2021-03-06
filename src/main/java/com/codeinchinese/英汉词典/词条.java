package com.codeinchinese.英汉词典;

import java.util.List;

/**
 * 数据格式: https://github.com/skywind3000/ECDICT#%E6%95%B0%E6%8D%AE%E6%A0%BC%E5%BC%8F
 */
public class 词条 {

  // TODO: 避免public域?
  public String 英文;
  public String 音标;
  public List<String> 英文释义;
  public List<String> 中文释义;
  public String 词语位置;
  public int 柯林斯星级;
  public boolean 为牛津三千核心词;

  // zk/中考，gk/高考，cet4/四级等
  public String 标签;

  // 如果为0, 无词频数据, 否则为正数
  public int 英国国家语料库词频顺序;
  public int 当代语料库词频顺序;

  public List<词形变化> 变形;
  public String 详细;
  public String 在线读音音频;

  @Override
  public String toString() {
    return "{\n" +
  "英文: " + 英文 + "\n" +
  "音标: " + 音标 + "\n"  +
  "英文释义: " + 转为文本(英文释义, "\n") + "\n"  +
  "中文释义: " + 转为文本(中文释义, "\n") + "\n"  +
  "词语位置: " + 词语位置 + "\n"  +
  "柯林斯星级: " + 柯林斯星级 + "\n"  +
  "为牛津三千核心词: " + 为牛津三千核心词 + "\n"  +
  "标签: " + 标签 + "\n"  +
  "英国国家语料库词频顺序: " + 英国国家语料库词频顺序 + "\n"  +
  "当代语料库词频顺序: " + 当代语料库词频顺序 + "\n"  +
  "变形: " + 转为文本(变形, "; ") + "\n"  +
  "详细: " + 详细 + "\n"  +
  "在线读音音频: " + 在线读音音频 + "\n"  +
  "}";
  }

  private String 转为文本(List<?> 变形, String 分隔) {
    String 输出 = "";
    for (Object 某变形 : 变形) {
      输出 += 某变形.toString() + 分隔;
    }
    return 输出;
  }
}
