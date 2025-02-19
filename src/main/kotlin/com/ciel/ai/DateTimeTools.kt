package com.ciel.ai
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import org.springframework.ai.tool.annotation.Tool
import org.springframework.context.i18n.LocaleContextHolder
class DateTimeTools {
		@Tool(name = "DateTimeTools", description = "A tool for getting the current date and time")
		fun getCurrentDateTime(): String {
				return LocalDateTime.now().atZone(LocaleContextHolder.getTimeZone().toZoneId()).toString()
		}
		@Tool(description = "set a user alarm for the given time, provided in ISO-8601 format.")
		fun setAlarm(time: String): Unit {
				val localDateTime: LocalDateTime = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME)
				println("Alarm set for $localDateTime")
		}
}
