package com.example.jsonfeeddownloader.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
data class GitHubUserModel(
    @PrimaryKey
    var id: Int = 1,
    var avatar_url: String = "",
    var events_url: String = "",
    var followers_url: String = "",
    var following_url: String = "",
    var gists_url: String = "",
    var gravatar_id: String = "",
    var html_url: String = "",
    var login: String = "",
    var node_id: String = "",
    var organizations_url: String = "",
    var received_events_url: String = "",
    var repos_url: String = "",
    var site_admin: Boolean = false,
    var starred_url: String = "",
    var subscriptions_url: String = "",
    var type: String = "",
    var url: String = ""
)