/*
 * Copyright 2023 OpenSPG Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 */
package com.antgroup.openspg.common.util.enums;

public enum ReactionTypeEnum {
  DEFAULT,
  UP,
  DOWN;

  public static ReactionTypeEnum getReactionTypeEnum(String reactionType) {
    for (ReactionTypeEnum reactionTypeEnum : ReactionTypeEnum.values()) {
      if (reactionTypeEnum.name().equals(reactionType)) {
        return reactionTypeEnum;
      }
    }
    throw new IllegalArgumentException("Unsupported reactionType:" + reactionType);
  }
}
