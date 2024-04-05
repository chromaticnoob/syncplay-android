package com.yuroyami.syncplay.lyricist.localizations

import com.yuroyami.syncplay.lyricist.Strings
import com.yuroyami.syncplay.utils.format

val EnStrings = object : Strings {

    override val yes = "Yes"
    override val no = "No"
    override val okay = "Okay"
    override val cancel = "Cancel"
    override val dontShowAgain = "Don't show this again"
    override val play = "Play"
    override val pause = "Pause"
    override val delete = "Delete"
    override val confirm = "Confirm"
    override val done = "Done"
    override val close = "Close"
    override val off = "Off"
    override val on = "On"
    override val tabConnect = "Connect"
    override val tabSettings = "Settings"
    override val tabAbout = "About"
    override val connectUsernameA = "Type your username:"
    override val connectUsernameB = "Username"
    override val connectUsernameC = "A name of your choice"
    override val connectRoomnameA = "Insert room name:"
    override val connectRoomnameB = "Room name"
    override val connectRoomnameC = "Room where you and your friends watch"
    override val connectServerA = "Select Syncplay server:"
    override val connectServerB = "Server address"
    override val connectServerC = "Make sure that you and your friends join the same server."
    override val connectButtonJoin = "Join Room"
    override val connectButtonSaveshortcut = "Save current config as home shortcut"
    override val connectButtonCurrentEngine = { p0: String -> "Current engine: %s".format(p0) }
    override val connectFootnote = "Syncplay's Unofficial Android Client"
    override val connectUsernameEmptyError = "Username shouldn't be empty"
    override val connectRoomnameEmptyError = "Roomname shouldn't be empty"
    override val connectAddressEmptyError = "Server Address shouldn't be empty"
    override val connectPortEmptyError = "Enter port!"
    override val connectEnterCustomServer = "Enter Custom Server"
    override val connectCustomServerPassword = "Password (Empty if not required)"
    override val connectPort = "Port"
    override val connectNightmodeswitch = "Switch the day/night mode."
    override val connectSolomode = "Offline mode"

    override val roomSelectedVid = { p0: String -> "Selected video file: %s".format(p0) }
    override val roomSelectedSub = { p0: String -> "Loaded subtitle file: %s".format(p0) }
    override val roomSelectedSubError = "Invalid subtitle file. Supported formats are: 'SRT', 'TTML', 'ASS', 'SSA', 'VTT'"
    override val roomSubErrorLoadVidFirst = "Load video first"
    override val roomTypeMessage = "Type your message…"
    override val roomReady = "Ready"
    override val roomNotReady = "Not Ready"
    override val roomPingConnected = { p0: String -> "Connected - %s ms".format(p0) }
    override val roomPingDisconnected = "Disconnected"
    override val roomEmptyMessageError = "Type something!"
    override val roomAttemptingConnect = { p0: String, p1: String -> "Attempting to connect to %1s:%2s".format(p0, p1) }
    override val roomConnectedToServer = "Successfully connected to the server."
    override val roomConnectionFailed = "Connecting failed."
    override val roomAttemptingReconnection = "Lost connection to the server."
    override val roomAttemptingTls = "Attempting secure connection"
    override val roomTlsSupported = "Secure connection established (TLS)"
    override val roomTlsNotSupported = "Server does not support TLS"
    override val roomGuyPlayed = { p0: String -> "%s unpaused".format(p0) }
    override val roomGuyPaused = { p0: String, p1: String -> "%1s paused at %2s".format(p0, p1) }
    override val roomSeeked = { p0: String, p1: String, p2: String -> "%1s jumped from %2s to %3s".format(p0, p1, p2) }
    override val roomRewinded = { p0: String -> "Rewinded due to time difference with %s".format(p0) }
    override val roomGuyLeft = { p0: String -> "%s left the room.".format(p0) }
    override val roomGuyJoined = { p0: String -> "%s joined the room.".format(p0) }
    override val roomIsplayingfile = { p0: String, p1: String, p2: String -> "%1s is playing '%2s' (%3s)".format(p0, p1, p2) }
    override val roomYouJoinedRoom = { p0: String -> "You have joined the room: %s".format(p0) }
    override val roomScalingFitScreen = "Resize Mode: FIT TO SCREEN"
    override val roomScalingFixedWidth = "Resize Mode: FIXED WIDTH"
    override val roomScalingFixedHeight = "Resize Mode: FIXED HEIGHT"
    override val roomScalingFillScreen = "Resize Mode: FILL SCREEN"
    override val roomScalingZoom = "Resize Mode: Zoom"
    override val roomSubTrackChanged = { p0: String -> "Subtitle Track changed to: %s".format(p0) }
    override val roomAudioTrackChanged = { p0: String -> "Audio Track changed to: %s".format(p0) }
    override val roomAudioTrackNotFound = "No audio found !"
    override val roomSubTrackDisable = "Disable Subtitles"
    override val roomTrackTrack = "Track"
    override val roomSubTrackNotfound = "No subtitles found !"
    override val roomDetailsCurrentRoom = { p0: String -> "Room: %s".format(p0) }
    override val roomDetailsNofileplayed = "(No file being played)"
    override val roomDetailsFileProperties = { p0: String, p1: String -> "Duration: %1s - Size: %2s MBs".format(p0, p1) }
    override val roomFileMismatchWarningCore = { p0: String -> "Your file is different from %s's file in the following ways: ".format(p0) }
    override val roomFileMismatchWarningName = "Name."
    override val roomFileMismatchWarningDuration = "Duration."
    override val roomFileMismatchWarningSize = "Size."
    override val roomSharedPlaylist = "Room's Shared Playlist"
    override val roomSharedPlaylistBrief = "Import a file or a directory to include file name(s) into the playlist. Click on a file line to get all users to play it."
    override val roomSharedPlaylistUpdated = { p0: String -> "%s updated the playlist".format(p0) }
    override val roomSharedPlaylistChanged = { p0: String -> "%s changed the playlist current selection".format(p0) }
    override val roomSharedPlaylistNoDirectories = "You have not specified any media directories for shared playlists. Manually add the files."
    override val roomSharedPlaylistNotFound = "Syncplay couldn't find the file that is currently playing in the shared playlist in your media directories."
    override val roomSharedPlaylistNotFeatured = "This room or server do not have Shared Playlists feature on."
    override val roomSharedPlaylistButtonAddFile = "Add file(s) to bottom of playlist"
    override val roomSharedPlaylistButtonAddFolder = "Add folder to playlist (and media directories)"
    override val roomSharedPlaylistButtonAddUrl = "Add URL(s) to bottom of playlist"
    override val roomSharedPlaylistButtonShuffle = "Shuffle entire playlist"
    override val roomSharedPlaylistButtonShuffleRest = "Shuffle remaining playlist"
    override val roomSharedPlaylistButtonOverflow = "More Shared Playlist settings"
    override val roomSharedPlaylistButtonPlaylistImport = "Load playlist from file"
    override val roomSharedPlaylistButtonPlaylistImportNShuffle = "Load and shuffle playlist from file"
    override val roomSharedPlaylistButtonPlaylistExport = "Save playlist to file"
    override val roomSharedPlaylistButtonSetMediaDirectories = "Set media directories"
    override val roomSharedPlaylistButtonSetTrustedDomains = "Set trusted domains"
    override val roomSharedPlaylistButtonUndo = "Undo last change"
    override val roomButtonDescAspectRatio = "Aspect Ratio"
    override val roomButtonDescSharedPlaylist = "Shared Playlist"
    override val roomButtonDescAudioTracks = "Audio Tracks"
    override val roomButtonDescSubtitleTracks = "Subtitle Tracks"
    override val roomButtonDescRewind = "Rewind"
    override val roomButtonDescToggle = "."
    override val roomButtonDescPlay = "Play"
    override val roomButtonDescPause = "Pause"
    override val roomButtonDescFfwd = "Fast-forward"
    override val roomButtonDescAdd = "Add Media"
    override val roomButtonDescLock = "Touch-lock"
    override val roomButtonDescMore = "More Settings"
    override val roomAddmediaOffline = "From phone storage"
    override val roomAddmediaOnline = "From a network URL"
    override val roomAddmediaOnlineUrl = "URL address"
    override val roomSkipMinuteAndHalfButton = "Skip 1 minute and 30 seconds"
    override val roomOverflowTitle = "More Options..."
    override val roomOverflowPip = "Picture-in-Picture"
    override val roomOverflowMsghistory = "Chat History"
    override val roomOverflowToggleNightmode = "Toggle night-mode"
    override val roomOverflowLeaveRoom = "Leave room"
    override val roomCardTitleUserInfo = "User info"
    override val roomCardTitleInRoomPrefs = "In-room Preferences"

    override val mediaDirectories = "Media Directories for Shared Playlist"
    override val mediaDirectoriesBrief = "Syncplay will search any media directories you specify here in order to find a name that a shared playlist is playing. It is much better if you specify small directories as the searching operation can throttle and be very slow."
    override val mediaDirectoriesSettingSummary = "Syncplay will search any media directories you specify here in order to find a name that a shared playlist is playing."
    override val mediaDirectoriesSave = "Save & Exit"
    override val mediaDirectoriesClearAll = "Clear all"
    override val mediaDirectoriesClearAllConfirm = "Are you sure you want to clear the list ?"
    override val mediaDirectoriesAddFolder = "Add folder"
    override val mediaDirectoriesDelete = "Remove from list"
    override val mediaDirectoriesShowFullPath = "Show full path"

    override val settingsCategGeneral = "General"
    override val settingsCategExoplayer = "Exoplayer"
    override val settingsCategLanguage = "Language"
    override val settingsCategSyncing = "Syncing"
    override val settingsCategNetwork = "Network"
    override val settingsCategAdvanced = "Advanced"
    override val uisettingCategChatColors = "Chat colors"
    override val uisettingCategChatProperties = "Chat properties"
    override val uisettingCategPlayerSettings = "Player settings"
    override val uisettingCategMpv = "mpv"
    override val uisettingMpvHardwareAccelerationTitle = "Hardware Acceleration"
    override val uisettingMpvHardwareAccelerationSummary = "Disable this to use software acceleration instead."
    override val uisettingMpvGpunextTitle = "Use gpu-next"
    override val uisettingMpvGpunextSummary = "Force mpv to use brand-new video rendering backend, based on libplacebo."
    override val uiSettingMpvDebugTitle = "Enable debugging"
    override val uiSettingMpvDebugSummary = "Show statistics and information about the current backend."
    override val uiSettingMpvInterpolationTitle = "Framerate Interpolation"
    override val uiSettingMpvInterpolationSummary = "Reduce jittering by enabling framerate interpolation. This may not work well in some cases."
    override val settingNightModeTitle = "Night Mode"
    override val settingNightModeSummary = "Select the night mode behavior."
    override val settingRememberJoinInfoTitle = "Remember joining info"
    override val settingRememberJoinInfoSummary = "Enabled by default. This will allow SyncPlay to save your last username, roomname, and which official server you last used."
    override val settingEraseShortcutsTitle = "Erase all home shortcuts"
    override val settingEraseShortcutsSummary = "This will erase all the 'quick run' home shortcuts that you created via the main screen to save your room configs."
    override val settingEraseShortcutsDialog = "Do you really wish to erase all existing shortcuts ?"
    override val settingDisplayLanguageTitle = "Display Language"
    override val settingDisplayLanguageSummry = "Select your language of choice with which Syncplay is displayed."
    override val settingDisplayLanguageToast = "Changed language. Restart app for the setting to take full effect."
    override val settingAudioDefaultLanguageTitle = "Preferred Audio Track Language"
    override val settingAudioDefaultLanguageSummry = "Automatically load a audio track with the language code you set here." +
            " For example, English code is 'en-US', Japanese is 'ja-JP'. Google 'IETF BCP 47 codes' for more information."
    override val settingCcDefaultLanguageTitle = "Preferred Subtitle Language"
    override val settingCcDefaultLanguageSummry = "Automatically load a subtitle track with the language code you set here. " +
                "For example, English code is 'en-US', Japanese is 'ja-JP'. Google 'IETF BCP 47 codes' for more information."
    override val settingUseBufferTitle = "Use Custom Buffer Sizes"
    override val settingUseBufferSummary = "If you are not satisfied with the player's video load times before and during playback, you can use custom buffer sizes (Use at your own risk)."
    override val settingMaxBufferTitle = "Custom max buffer size"
    override val settingMaxBufferSummary =
        "Default is 30 (30000 milliseconds). This determines the maximum buffer size before starting to play the video. If you don't know what this is, don't change it."
    override val settingMinBufferSummary =
        "Default is 15 (15000 milliseconds). Decrease this value to play video faster but there is a possibility that the player may fail or even crash. Change at your own risk."
    override val settingMinBufferTitle = "Custom min buffer size"
    override val settingPlaybackBufferSummary =
        "Default is 2500 milliseconds. This represents the buffer size when SEEKING or UNPAUSING the video. Change this if you're not satisfied with the small delay when seeking video."
    override val settingPlaybackBufferTitle = "Custom playback buffer size (ms)"
    override val settingReadyFirsthandSummary = "Enable this if you want to be set automatically as ready once you enter the room."
    override val settingReadyFirsthandTitle = "Set as ready first-hand"
    override val settingRewindThresholdSummary = "If someone is behind with the value you select here, your video will be rewinded to match with the one behind."
    override val settingRewindThresholdTitle = "Rewind thresold"
    override val settingTlsSummary = "Syncplay will attempt to establish a secure encrypted connection (mainly TLSv1.3 but fallbacks to older versions) with the server if the latter supports it. This setting will be ignored if the network engine does not support TLS."
    override val settingTlsTitle = "Use Secure Connection (TLS)"
    override val settingResetdefaultTitle = "Reset Default Settings"
    override val settingResetdefaultSummary = "Reset everything to its default value (Recommended)"
    override val settingResetdefaultDialog = "Are you sure to clear settings for this screen ?"
    override val settingPauseIfSomeoneLeftTitle = "Pause if someone leaves"
    override val settingPauseIfSomeoneLeftSummary = "Enable this if you want playback to pause/stop if someone leaves the room while you're watching."
    override val settingWarnFileMismatchTitle = "File mismatch warning"
    override val settingWarnFileMismatchSummary =
        "Enabled by default. This will warn you in case you load a file that is different from users in the group (in terms of name, duration or size, not all of them)."
    override val settingFileinfoBehaviourNameTitle = "File name information sending"
    override val settingFileinfoBehaviourNameSummary = "Choose the method with which you show your added media file name to other users."
    override val settingFileinfoBehaviourSizeTitle = "File size information sending"
    override val settingFileinfoBehaviourSizeSummary = "Choose the method with which you show your added media file size to other users."

    override val uisettingApply = "APPLY"
    override val uisettingTimestampSummary = "Disable this to hide the timestamps at the beginning of chat messages."
    override val uisettingTimestampTitle = "Chat timestamps"
    override val uisettingMsgoutlineSummary = "Enable this to give chat messages an outline, to reduce blending with background video."
    override val uisettingMsgoutlineTitle = "Chat message outline"
    override val uisettingMsgshadowSummary = "Enable this to give chat messages a shadow, to reduce blending with background video."
    override val uisettingMsgshadowTitle = "Chat message shadow"
    override val uisettingMsgboxactionSummary =
        "When enabled, clicking on the 'OK' button on your keyboard will send the message. When this is disabled, it will simply close the keyboard without doing anything."
    override val uisettingMsgboxactionTitle = "Keyboard's OK button function"
    override val uisettingOverviewAlphaSummary = "Default is 40 (Almost transparent), change this if you want to make the room details' panel more readable by increasing opacity."
    override val uisettingOverviewAlphaTitle = "Room Details Background Opacity"
    override val uisettingMessageryAlphaSummary = "Default is 0 (transparent). Maximum is 255 (100% Opaque). Increase readability of the messages by making background more opaque."
    override val uisettingMessageryAlphaTitle = "Messages' background opacity"
    override val uisettingMsgsizeSummary = "Changes message text size. Default is 10."
    override val uisettingMsgsizeTitle = "Message font size"
    override val uisettingMsgcountSummary = "Default is 10. Limits the message number count to this value."
    override val uisettingMsgcountTitle = "Message max count"
    override val uisettingMsglifeSummary = "When receiving a chat message or room message, it will begin fading out for the amount of time set below."
    override val uisettingMsglifeTitle = "Display duration for Chat messages"
    override val uisettingTimestampColorSummary = "Customize the text color of message timestamps (Default is Pink)"
    override val uisettingTimestampColorTitle = "Timestamp Text Color"
    override val uisettingSelfColorSummary = "Customize the text color of your name tag (Default is Dark Red)"
    override val uisettingSelfColorTitle = "Self Tag Color"
    override val uisettingFriendColorSummary = "Customize the text color of friends' name tags (Default is Blue)"
    override val uisettingFriendColorTitle = "Friend Tag Text Color"
    override val uisettingSystemColorSummary = "Customize the text color of system room messages (Default is White)"
    override val uisettingSystemColorTitle = "System Message Text Color"
    override val uisettingHumanColorSummary = "Customize the text color of user messages (Default is White)"
    override val uisettingHumanColorTitle = "User Message Text Color"
    override val uisettingErrorColorSummary = "Customize the text color of error messages (Default is Red)"
    override val uisettingErrorColorTitle = "Error Message Text Color"
    override val uisettingSubtitleSizeSummary =
        "This changes subtitle size for sideloaded subtitles (when you load them from a file). Default is 16. Subtitle size for built-in subtitles cannot be changed."
    override val uisettingSubtitleSizeTitle = "Subtitle Size"
    override val uisettingSubtitleDelaySummary = "Default is 0. This will delay or advance the subtitle track. Use negative values to advance it."
    override val uisettingSubtitleDelayTitle = "Subtitle delay (milliseconds)"
    override val uisettingAudioDelaySummary = "Default is 0. This will delay or advance the audio track. Use negative values to advance it."
    override val uisettingAudioDelayTitle = "Audio track delay (milliseconds)"
    override val uisettingSeekForwardJumpSummary = "Specifies how many seconds a seek-forward should skip. Default is 10 seconds."
    override val uisettingSeekForwardJumpTitle = "Seek forward jump amount (seconds)"
    override val uisettingSeekBackwardJumpSummary = "Specifies how many seconds a seek-backward should rewind. Default is 10 seconds."
    override val uisettingSeekBackwardJumpTitle = "Seek backward jump amount (seconds)"
    override val uisettingPipSummary = "Whether the player should enter windowed picture-in-picture mode when minimizing the app. Default is true"
    override val uisettingPipTitle = "Picture-in-picture mode"
    override val uisettingReconnectIntervalSummary = "How many seconds to wait for reconnection on each failure of connection or disconneciton. Default is 2 seconds."
    override val uisettingReconnectIntervalTitle = "Reconnection interval"
    override val uisettingResetdefaultSummary = "Reset all of the above settings to default."
    override val uisettingResetdefaultTitle = "Reset Default Settings"
    override val settingFileinfoBehaviorA = "Send raw"
    override val settingFileinfoBehaviorB = "Send hashed"
    override val settingFileinfoBehaviorC = "Don't send"

    override val settingNetworkEngineTitle = "Network Engine"
    override val settingNetworkEngineSummary = "The network engine serves as the backbone of connectivity. Experiment with each option and choose the one that offers the most stability for your needs."
    override val settingNetworkEngineNetty = "Netty (Recommended, TLS)"
    override val settingNetworkEngineSwiftNIO = "SwiftNIO (Recommended)"
    override val settingNetworkEngineKtor = "Ktor (Experimental)"

}