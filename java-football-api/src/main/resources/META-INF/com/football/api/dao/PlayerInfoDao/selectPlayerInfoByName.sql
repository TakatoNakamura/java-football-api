SELECT
	player_info_id,
	player_name,
	age,
	country,
	current_club_team,
	date_of_birth_year,
	date_of_birth_month,
	date_of_birth_day,
	current_timestamp,
	update_timestamp
FROM
	player_info
WHERE
	player_name = /* playerName */'footballPlayer'
