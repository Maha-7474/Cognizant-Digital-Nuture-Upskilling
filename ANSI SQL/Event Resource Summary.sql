select e.event_id, e.title, count(case when r.resource_type='pdf' then 1 end) as pdf_count,
							count(case when r.resource_type='image' then 1 end) as img_count,
                            count(case when r.resource_type='link' then 1 end) as link_count,
                            count(r.resource_id) as total_resources
from events e left join resources r on e.event_id=r.event_id group by e.event_id,e.title