// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.datasource.mapping;

import org.apache.doris.catalog.Column;

import java.util.List;
import java.util.Map;

public interface IdentifierMapping {
    List<String> fromRemoteDatabaseName(List<String> remoteDatabaseNames);

    List<String> fromRemoteTableName(String remoteDatabaseName, List<String> remoteTableNames);

    List<Column> fromRemoteColumnName(String remoteDatabaseName, String remoteTableName, List<Column> remoteColumns);

    String toRemoteDatabaseName(String localDatabaseName);

    String toRemoteTableName(String remoteDatabaseName, String localTableName);

    Map<String, String> toRemoteColumnNames(String remoteDatabaseName, String remoteTableName);
}
