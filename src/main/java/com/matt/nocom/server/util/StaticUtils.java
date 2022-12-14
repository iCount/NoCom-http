package com.matt.nocom.server.util;

import com.matt.nocom.server.Logging;
import com.matt.nocom.server.model.auth.User;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

public class StaticUtils implements Logging {
  private static final Pattern UUID_PATTERN =
      Pattern.compile("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)");

  public static boolean arraysSameLength(Object[]... arrays) {
    if (arrays.length > 0) {
      int len = arrays[0].length;
      for(int i = 1; i < arrays.length; ++i) // start at 1 since we don't need to compare
        if(len != arrays[i].length)
          return false;
    }
    return true;
  }
  
  public static InetAddress stringToAddress(String address) {
    try {
      return InetAddress.getByName(address);
    } catch (UnknownHostException e) {
      throw new Error(e);
    }
  }
  
  public static UsernamePasswordAuthenticationToken toAuthenticationToken(UserDetails details) {
    return new UsernamePasswordAuthenticationToken(details, details.getPassword(),
        details.getAuthorities());
  }
  
  public static List<RequestMatcher> antMatchers(String... uris) {
    return Arrays.stream(uris)
        .map(uri -> new AntPathRequestMatcher(uri, null))
        .collect(Collectors.toUnmodifiableList());
  }

  public static UUID parseUUID(String uuid) {
    if(!uuid.contains("-")) {
      uuid = UUID_PATTERN.matcher(uuid).replaceAll("$1-$2-$3-$4-$5");
    }
    return UUID.fromString(uuid);
  }
  
  public static Optional<User> getCurrentUserContext() {
    return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication())
        .map(Authentication::getPrincipal)
        .filter(User.class::isInstance)
        .map(User.class::cast);
  }
}
