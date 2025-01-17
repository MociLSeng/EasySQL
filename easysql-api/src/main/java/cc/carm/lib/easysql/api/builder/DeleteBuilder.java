package cc.carm.lib.easysql.api.builder;

import cc.carm.lib.easysql.api.action.PreparedSQLUpdateAction;

public interface DeleteBuilder extends ConditionalBuilder<PreparedSQLUpdateAction> {

	String getTableName();

}
