/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.session;

import java.sql.Connection;

/**
 * @author Clinton Begin
 * 事务隔离级别枚举
 */
public enum TransactionIsolationLevel {
  NONE(Connection.TRANSACTION_NONE),//不支持事务 0
  READ_COMMITTED(Connection.TRANSACTION_READ_COMMITTED),//读已提交 2
  READ_UNCOMMITTED(Connection.TRANSACTION_READ_UNCOMMITTED),//读未提交 1
  REPEATABLE_READ(Connection.TRANSACTION_REPEATABLE_READ),//可重复读 4
  SERIALIZABLE(Connection.TRANSACTION_SERIALIZABLE);//串行化 8

  private final int level;

  private TransactionIsolationLevel(int level) {
    this.level = level;
  }

  public int getLevel() {
    return level;
  }
}
