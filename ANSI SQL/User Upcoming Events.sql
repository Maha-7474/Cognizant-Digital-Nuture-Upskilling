use eventmanagement;
SELECT u.user_id,u.full_name,u.city as user_city, e.event_id,e.title,e.start_date 
from users u 
join registrations r on u.user_id=r.user_id 
join events e on r.event_id=e.event_id 
where e.status="upcoming" and u.city=e.city 
order by e.start_date;