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
package com.antgroup.openspg.server.infra.dao.dataobject;

import java.util.Date;
import lombok.Data;

@Data
public class FeedbackDO {

  private Long id;
  private Date gmtCreate;
  private Date gmtModified;
  private String modifier;
  private String creator;
  private String moduleType;
  private String oneCategory;
  private String twoCategory;
  private String threeCategory;
  private String fourCategory;
  private String fiveCategory;
  private String reactionType;
  private String reason;
}
