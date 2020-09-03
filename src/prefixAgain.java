public class prefixAgain {
  public boolean prefixAgain(String str, int n) {
    String prefix = str.substring(0, n);

    for (int i = n; i <= str.length() - prefix.length(); i++) {
      if (str.substring(i, i + prefix.length()).equals(prefix)) {
        return true;
      }
    }
    return false;
  }
}

/* IntelliJ suggest the below but not totally clear to me:
  public boolean prefixAgain(String str, int n) {
    String prefix = str.substring(0, n);

    for (int i = n; i <= str.length() - prefix.length(); i++) {
    since you started passed the prefix already and you find a similar string as the prefix, you return true?
      if (str.startsWith(prefix, i)) {
        return true;
      }
    }
    return false;
  }
 */