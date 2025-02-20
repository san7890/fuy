package com.busted_moments.core.json.codecs;

import com.busted_moments.core.json.Codec;
import com.busted_moments.core.util.UUIDUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Type;
import java.util.UUID;

@Codec.Definition(UUID.class)
public class UUIDCodec extends Codec<UUID, String> {
   @Override
   public @Nullable String write(UUID value, Class<?> type, Type... typeArgs) throws Exception {
      return toString(value, type, typeArgs);
   }

   @Override
   public @Nullable UUID read(@NotNull String value, Class<?> type, Type... typeArgs) throws Exception {
      return fromString(value, type, typeArgs);
   }

   @Override
   public UUID fromString(String string, Class<?> type, Type... typeArgs) throws Exception {
      return UUIDUtil.parseUUID(string);
   }

   @Override
   public String toString(UUID value, Class<?> type, Type... typeArgs) throws Exception {
      return value.toString();
   }
}
